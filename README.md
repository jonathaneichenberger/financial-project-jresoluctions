# Projeto de Web services com Spring Boot e JPA
>## Domain Model
 ```mermaid
classDiagram
  class User {
  - id : Integer
  - name : String
  - email : String
  - phone : String
  - password : String
  }

  class Order {
  - id : Integer
  - moment : Date
  - orderStatus : OrderStatus
  + total() : Double
  }

   class OrderItem {
  - quantity : Integer
  - price : Double
  + subTotal() : Double
  }

  class Product {
  - id : Integer
  - name : String
  - price : Double
  - imgUrl : String
  }

  class Category {
  - id : Integer
  - name : String
  }

  class Payment {
  - id : Integer
  - moment : Date
  }
  
  class OrderStatus {
  <<enum>>
  - WAITING_PAYMENT : int
  - PAID : int
  - SHIPPED : int
  - DELIVERED : int
  - CANCELED : int
  }
  
  %% Relacionamentos
  User "1" --> "*" Order
  Order "*" --> "1..*" Product
  Product "1" ..> "*" OrderItem 
  Order "1" ..> "*" OrderItem
  Product "*" --> "1..*" Category
  Order "1" --> "0..1" Payment
  ```
>## Domain Instance
![image](https://github.com/user-attachments/assets/c89a45bc-a125-4af4-a0f1-51ed27eb445d)
  
