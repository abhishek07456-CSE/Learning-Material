let name = {
    first_name : "abhishek",
    second_name : "chaudhary"
}
function printName(){
    return this.first_name + " " + this.second_name + " " + arguments[0] + " " + arguments[1];
}

let data = printName.bind(name,"chandigarh");
console.log(data("kanara"));


Function.prototype.custom_bind = function (context, ...args1) {
    let fn = this;
    // console.log(fn);
    return function (...arg2) {
       return fn.apply(context, [...args1, ...arg2])
    }
};
let custom = printName.custom_bind(name , "hierarchal");
console.log(custom("Ddd"));
