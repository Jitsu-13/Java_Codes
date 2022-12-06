/*
var person1={
    name:"Albert",
    city:"Mumbai",
    printCity:function(){
        return this.city;
    }
}
*/

// classes are template for creatig objects 

class className{
    // constructor 
    // method
}
class Person{
    constructor(name,city){
        this.name=name;
        this.city=city;
    }
    welcome(){
        return "Welcome "+this.name+" from "+this.city;
    }
}
var Person1=new Person("Aman","Patna");
// console.log(Person1.welcome());
/*
class Rectangle{
    constructor(length,bredth){
        this.length=length;
        this.bredth=bredth;
    }
    area(){
        return this.length*this.bredth;
    }
    totalprice(price){
        return this.length*this.bredth*price;
    }
}

var rect1=new Rectangle(5,4);
console.log(rect1.area());
console.log(rect1.totalprice(1000));

*/

//isEmpty()-true/false

class Arr{
    constructor(){
        this.arr=[];
        this.length=0;
    }
    isEmpty(){
        if(this.arr.length==0){
            return true;
        }else{
            return false;
        }
    }
    push(ele){
        this.arr[this.length]=ele;
        this.length++;
    }
    pop(){
        
        this.length--;
    }
}

var arr=new Arr();
arr.push(15);
arr.push(25);
console.log(arr.isEmpty());
arr.pop();
console.log(arr);


