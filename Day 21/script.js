class Vehicle{
    constructor(name , price , model){
        this.name = name;
        this.price = price;
        this.model = model;
    }
}
// let vehicle1 = new Vehicle("BMW" , 20000000 , 2022);
// let vehicle2= new Vehicle("Alto",40000,2023);
// console.log(vehicle1);
// console.log(vehicle2);

class Car extends Vehicle{
    constructor(name,price,model,tyres,color){
        super(name,price,model);
        this.tyres=tyres;
        this.color=color;
    }
}

let car1=new Car("BMW",20000000,2022,4,"blue");
console.log(car1);