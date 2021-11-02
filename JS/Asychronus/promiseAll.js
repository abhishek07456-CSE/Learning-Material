/*
  promise.all wait for all if all settled then return status in array, and return new promise

*/

let promise1 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("hello");
    },2000);
});
let promise2 = new Promise((resolve,reject)=>{
 setTimeout(()=>{
     resolve("world");
 },7000);
});
let promise = Promise.all([promise1,promise2]);
promise
.then((results)=>results.forEach(element => {console.log(element);}))
.catch((e) => {console.log("some error")});