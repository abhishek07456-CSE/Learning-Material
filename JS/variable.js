let name = 'john'; // auto data type
let score = '100';
let bonus = '20';
console.log(name);
console.log(parseInt(score)+parseInt(bonus));

let a = 100;
function change(){
//    let a = 20; //create other scope
        a = 20 // use last scope
}
console.log("before call " + a);
change();
console.log("after call " + a);
