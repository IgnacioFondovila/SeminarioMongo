package com.example.tpe4spb.repository;

import com.example.tpe4spb.model.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseRepository extends MongoRepository<Sale,Long> {

}
/*//        @Query( "SELECT concat(c.name, ' ', c.surname), p.count,pr.price FROM Sale p , Client c,Product pr WHERE p.client = c.dni AND p.product = pr.id");
//    @Query("SELECT concat(c.name,' ', c.surname), pu.count,pr.price FROM Sale pu JOIN pu.client c JOIN pu.product pr")
    @Query("SELECT new com.example.tpe4spb.dto.ClientBalanceElemDTO(CONCAT(c.name,' ',c.surname), (pu.count*pr.price)) FROM Sale pu JOIN pu.client c JOIN pu.product pr")
    public List<ClientBalanceElemDTO> getBalanceForClients();

    @Query("SELECT p FROM Sale p where  p.day=:day AND p.month=:month AND p.year=:year")
    public List<Sale> getDayBalance(Integer day, Integer month, Integer year);

//    @Query("INSERT p in purchase p where client = p.client and client")
//    public boolean save2(Sale pur)

    @Query("SELECT COUNT(p) FROM Sale p WHERE p.client = :client AND p.day = :day AND p.month = :month AND p.year = :year AND p.product = :product")
    public int getPurchasesOfClient(Client client, int day, int month, int year, Product product);

//    @Query  ("SELECT p.product FROM Sale p GROUP BY p.product ORDER BY p.count DESC")
    @Query  ("SELECT p.product FROM Sale p GROUP BY p.product ORDER BY SUM(p.count) DESC")
    public List<Product> findMostSell(PageRequest page);
}

//@Query( "SELECT  c.surname, p.count FROM PURCHASE p JOIN p.client");
    //    public List<ClientsBalanceReportDTO> findAllBySurname(String@Query("SELECT t FROM Person t where t.surname = :surname")
//    public List<> findAllBySurname(String surname);
//
//    @Query("SELECT t FROM Person t where t.name = :name")
//    public List<Person> findAllByName(String name);*/

