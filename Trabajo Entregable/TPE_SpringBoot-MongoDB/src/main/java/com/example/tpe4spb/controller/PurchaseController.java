/*
package com.example.tpe4spb.controller;


import com.example.tpe4spb.dto.ClientBalanceElemDTO;
import com.example.tpe4spb.dto.ClientsBalanceReportDTO;
import com.example.tpe4spb.model.Product;
import com.example.tpe4spb.model.Sale;
import com.example.tpe4spb.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("purchases")
public class PurchaseController {

    @Qualifier("purchaseRepository")
    @Autowired
    private final PurchaseRepository repo;
    @Qualifier("productController")
    @Autowired
    private final ProductController controllerProd;



    //Se declara el repo----------------------------------
    public PurchaseController (@Qualifier("purchaseRepository") PurchaseRepository repository, @Qualifier("productController") ProductController repository2){
        this.repo = repository;
        this.controllerProd = repository2;
    }

    //Métodos CRUD aquí abajo------------------------------
    @GetMapping("")
    public Iterable<Sale> getPurchases(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Sale> one(@PathVariable Long id){
        return repo.findById(id);
    }


//    @PostMapping("/client/{dni}/product/{product}/day/{day}/month/{month}/year/{year}")
    @PostMapping("/")
    public Sale newPurchase(@RequestBody Sale sales){
//        Aqui va el chequeo de que los clientes
//        no tengan más de dos compras ya hechas
        Client client = sales.getClient();
        Product product = sales.getProduct();
        int day = sales.getDay();
        int month = sales.getMonth();
        int year = sales.getYear();
        int clientPurchases = repo.getPurchasesOfClient(client, day, month, year, product);
        try {
                if (clientPurchases < 3 && product.getStock() >= sales.getCount()) {
                    product.setStock(product.getStock()- sales.getCount());
                    controllerProd.replaceProduct(sales.getProduct(), sales.getProduct().getId());
                    return repo.save(sales);
                }
//            }
        }catch (Exception n){
            System.out.println("error:"+n);
        }
        return null;
//        Response?
    }

    @DeleteMapping("/{id}")
    void deletePurchase(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @PutMapping("/{id}")
    Sale replacePurchase(@RequestBody Sale newSales, @PathVariable Long id) {

        return repo.findById(id)
                .map(sales -> {
                    if(newSales.getCount()!=null){
                        sales.setCount(newSales.getCount());
                    }
                    if(newSales.getDay()!=null) {
                        sales.setDay(newSales.getDay());
                    }
                    if(newSales.getMonth()!=null) {
                        sales.setMonth(newSales.getMonth());
                    }
                    if(newSales.getYear()!=null) {
                        sales.setYear(newSales.getYear());
                    }
                    return repo.save(sales);
                })
                .orElseGet(() -> {
                    newSales.setId(id);
                    return repo.save(newSales);
                });
    }

    //Método que da el reporte diario totall-------------------------------------------
    @GetMapping("/report/day/{day}/month/{month}/year/{year}")
    List<Sale> getClientsReport(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year) {
        return repo.getDayBalance(day,month,year);
    }

    //Método para obtener el reporte total de ventas por cliente---------------------------
    @GetMapping("/report")
    public ClientsBalanceReportDTO report(){
        List<ClientBalanceElemDTO> p=repo.getBalanceForClients();
        ClientsBalanceReportDTO c= new ClientsBalanceReportDTO(p);
        return c;
    }
//    @GetMapping("/report/clients")
//    public List<ClientBalanceElemDTO> getClientsReport() {
//        ArrayList<ClientsBalanceReportDTO> pq=(ArrayList<ClientsBalanceReportDTO>) repo.getBalanceForClients();
//        ArrayList<ClientBalanceElemDTO> cbr= new ArrayList<ClientBalanceElemDTO>();
//        for (int i = 0; i <pq.size(); i++) {
//            ClientsBalanceReportDTO aux = pq.get(i);
//            ClientBalanceElemDTO cb = new ClientBalanceElemDTO(aux.getClientName(),aux.getPrice_x_Product(),aux.getTotalUnits());
//            cbr.add(cb);
//        }
////        cbr.sort();
//        return cbr;
//    }

    //Método para conseguir el producto más vendido de todos---------------------
    @GetMapping("/mostsell")
    public List<Product> getProductMostBuy(){
        return (List<Product>) repo.findMostSell(PageRequest.of(0,1));
    }

}

*/
