# Actividades Clase 1

## *Lugo de nstalar MongoDB en ambiente local*

### *2) Conectarse a MongoDB vía CLI*

```js
mongo
```

### *3) Crear una nueva base de datos llamada futbolfifa*

```js
use futbolfifa
```

### *4) Crear una nueva collection llamada players*

```js
db.createCollection("players")
```
### *5)Insertar 5 documentos en la collection players con datos básicos (nombre, apellido, posición, fecha de nacimiento, etc).

```js
db.players.insert([
{"name": "Leonardo", "lastname": "Ponzio", "position": "CMD", "age": 38,"country":"Argentina"},
{"name": "Franco", "lastname": "Armani", "position": "GK, "age": 34,"country":"Argentina"},
{"name": "Nicolas", "lastname":"De La Cruz", "position":"CMD", "age": 23, "country":"Uruguay"},
{"name":"Rafael", "lastname":"Santos Borre Maury", "position":"DC","age": 25, "country":"Colombia"},
{"name":"Jorge Andres","lastname":"Carrascal Guardo","position":"DC","age": 22,"country":"Colombia"}]
```

### *6) Listar todos los documentos de la collection players*

```js
db.players.find()
```

### *7) Crear otras collections con documentos (ej. teams, games, etc)*
```js
db.clubs.insert([
    { name: "River Plate", country: "Argentina" },
    { name: "Boca Juniors", country: "Argentina" },
    { name: "San Lorezo De Almagro", country: "Argentina" },
    { name: "Rosario Central", country: "Argentina" },
    { name: "Independiente", country: "Argentina"},
    { name: "Banfield", country: "Argentina" }
    ]) 
```
