MongoDB
Database -> Database
Table -> Collection
Field -> Field
Row -> Document

Operasi dasar

- Membuat DB
use "DB_Name"

- Melihat DB
show "DB_Name"

- Membuat Collection
db.createCollection(name,option)

- CRUD
    1. Create -> db.collection.insertOne() & db.collection.insertMany()
    2. Retrieve -> db.collection.find()
    3. Update -> db.collection.updateOne(), updateMany(), dan replaceOne
    4. Delete -> db.collection.deleteOne() dan deleteMany()

