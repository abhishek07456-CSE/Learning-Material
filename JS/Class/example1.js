class Student{
     name = "vfvf";
     constructor(name , rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
     }

     toString(){
        return this.name + " " + this.rollNumber;
     }
}



let student1 = new Student("abhishek" , "1031");
let student3 = new Student();
console.log(student1.name);