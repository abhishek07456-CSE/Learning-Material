class Enumerable{
     constructor(){
        this.property1 = "a";
        this.method1 = function(){
            console.log("method 1");
        };
     }

     method2(){
        console.log("method 2");

     }

     method3 = function(){
        console.log("method 3");
     }

}

let enumerable = new Enumerable();

for(let prop in enumerable){
    console.log(prop); // property1 , method1 , method3
}