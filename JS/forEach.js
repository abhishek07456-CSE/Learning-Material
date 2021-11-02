let a = ["abhi" , "aki" , "xyz"];
a.forEach((value,index)=>{
    console.log(`index ${index} , value ${value}`);
})

 a= {
    "name" : "abhishe",
    "age"  : 23,
}
Object.keys(a).forEach((value)=>{
    console.log(value);
});
Object.entries(a).forEach((value)=>{
     const [a,b] = value;
    console.log(a+ " " + b);
});