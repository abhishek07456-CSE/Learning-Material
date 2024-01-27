/*
  inheritence work on prototype method
  if playSound method not found then set prototype to Dog.playsound to Animal.playSound


  rule :
  In a child class constructor, this cannot be used until super is called.
  arrow function not access of super keyword
  As said, the parent constructor always uses the parent field. https://javascript.info/class-inheritance


  __proto__ inheritence work on this approce .

  __proto__ is basically proto is also a way to share behavior and data between multiple objects access using __proto__
  https://www.geeksforgeeks.org/difference-between-proto-and-prototype/

  It is the property of the class.	prototype => when function declared
  It is the property of the class.	__prot__ => when insatnce created
*/

class Animal{
    name = "tom";
    constructor(){
        // this.name = "tom";
        console.log("constructor called");
    }

    playSound(){
        console.log(this.name); 
    }
}

class Dog extends Animal{
    name = "jacky";
    constructor(){
        super(); // why super is not autmatic. so if parent class has arugument function then that need to pass using super(a,b,c). becuase ES6 support only one cistructor then this is madtory otherwise null value will be passed
        // this.name = "jackky";
        console.log("Dog constructor called");
    }

    playSound(){
        super.playSound();
    }
}

let dog = new Dog();
//this will be overide here
// dog.playSound = function(){
//     console.log("Dog playSound called");
//     console.log("dog name "+ this.name);
// }
dog.playSound();