/*
one().minus().two().plus().three().equal()

1-2+3= -1+3 = 4
*/

class Operation {
    constructor(){
        this.operator = new Operator();
    }
    minus(){
        return "-"
    }
}

class Operator {
    constructor(){
        this.operation = new Operation();
    }
    one(){
        re
    }
}
class MathFactory{
   
    constructor(){
          this.output = 0;
          console.log("Math Factory initiated ...");
    }

    one(){
        return this;
    }
}