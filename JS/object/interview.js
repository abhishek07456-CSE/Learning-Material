/*

one().minus().two().plus().three().equal()

*/

let op = {
    a: -1,
    b: -1,
    c: -1,
    one(){
        if(this.a == -1)
        this.a = 1;
        else
        this.b = 1;
        return this;
    },
    two() {
        if(this.a == -1)
        this.a = 2;
        else
        this.b = 2;
        return this;
    },
    operation(op) {
        if (this.a != -1 && this.b != -1) {
            switch (op) {
                case "-":
                    this.c = this.a - this.b;
                    break;
                case "+":
                    this.c = this.a + this.b;
                    break;
                case "*":
                    this.c = this.a * this.b;
                    break;
                default:
                    this.c = this.b == 0 ? 0 : this.a/this.b;

            }
        }

        else if (this.a == -1)
            this.c = this.b;
        else
            this.c = this.a;

        this.a = this.c;
        this.b = -1;
        return this;
    },
    minus() {
       return this.operation("-");
    },
    plus() {
        return this.operation("+");
    },
    equal(){
        return this.c;
    },
    three(){
        if(this.a == -1)
        this.a = 3;
        else
        this.b = 3;
        return this;
    }


}

console.log(op.three().two().plus().one().plus().equal());