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

let promise3 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        reject("failed");
    },7000);
   });
let promise = Promise.all([promise1,promise2,promise3]);


promise
.finally(() => {
    console.log("execution done");
    return 1;
})
.then(
    (results)=> {
        results.forEach(element => {console.log(element);})
        return 2;
    }
).catch((e) => {
    console.log("some error")
      return 3;
})

