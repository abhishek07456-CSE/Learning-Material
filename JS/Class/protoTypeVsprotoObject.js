/*
  __proto__ vs __prototype__
https://levelup.gitconnected.com/javascripts-proto-vs-prototype-a21ec7f25bc1

he default prototype of every object is Object.prototype. Therefore, the __proto__ property of the person object points to the Object.prototype.
 -- everthing in js except data type is object
 -- object having default propety Object.ProtoType
 -- every instance have reference to this  ProtoType using __Proto__

*/

let teacher = {school : 'asian'} 
let person = {name : 'abhishek' , age : 25 , myInfo : function(){ console.log(this.name)}}

/*

       Object.prototype

    /                     \

 teacher.__proto__        person.__proto__ 

*/

console.log("teacher and person both having same __proto__ "  , teacher.__proto__ === person.__proto__);



// i want to inherit person property into teacher

Object.setPrototypeOf(teacher , person);

/*

       Object.prototype
    /                    
 person.__proto__  
 /
 teacher.__proto__ 

*/

console.log("Person Porperty in teacher " , teacher.name)

person.name = "Updated Abhishek";

teacher.myInfo();