

/*
   function also object but in case we need to create bunch of object of same property but differemt value then we use constructir

   function 
     __Proto__
     prototype for constructor
*/


function Student(name , id){
   this.name = name;
   this.id = id;
}

/*

     OBJECT.PROTOTYPE
       |
Student,__proto__  Student.prototype(constructor : age, name)

*/

let student1 = new Student("abhishek" , 1031);


/*

     OBJECT.PROTOTYPE
       |
Student,__proto__   Student.prototype(constructor : age, name)
                     |
                     student1
*/