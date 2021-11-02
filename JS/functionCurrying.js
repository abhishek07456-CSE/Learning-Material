function way1() {
    function curry(fun) {
        return (a) => {
            return (b) => {
                return fun(a, b);
            }
        }
    }
    function sum(a, b) {
        return a + b;
    }

    let addition = curry(sum);
    let fixedSecond = addition(1);
    console.log(fixedSecond(2));
    console.log(fixedSecond(3));
}
// way1();
/* recursion in currying */

function way2() {
    let multiply = (x,y) => {
       console.log(`${x} * ${y} = ${x*y}`);
    }
    let multiTwo = multiply.bind(this,2);
     multiTwo(5);
}
// way2();


// function sum(a){
//     return function(b){

//         return sum(a+b);
//     }
// }
let sum = a => b => b ? sum(a+b) : a;
console.log(sum(1)(2)(3)(4)());