/*

promise.race return first which settled fast i.e either reject or fullfil;
promise.any return first that first fullfil only
*/

let promise1 = new Promise((resolve,reject)=>{
       setTimeout(()=>{
           resolve("hello");
       },2000);
}).then((value)=>{
    console.log(value);
});
let promise2 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        reject(new Error('fail'));
    },1000);
}).then((value)=>{
    console.log(value);
}).catch((e)=>{

});
Promise.race([promise1, promise2]).then((value) => {
    console.log(value);
});

// Promise.any([promise1, promise2]).then((value) => {
//     console.log(value);
// });

Promise.allSettled([promise1, promise2]).then((result) => {
   result.forEach((value)=>{console.log(value)});
});