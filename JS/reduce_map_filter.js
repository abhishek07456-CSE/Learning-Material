let user = [
     {
          name : "abhishek",
          age : 23,
          city : "chandigarh"
     },
     {
        name : "sahil",
        age : 15,
        city : "himachal"
     },
     {
        name : "Manju",
        age : 24,
        city : "himaChal"
     },
     {
        name : "vicky",
        age : 23,
        city : "hiMachal"
     },
     {
        name : "Anish",
        age : 17,
        city : "chandigarh"
     },
];

//filter by chandigarh then get name only

let filter = user.filter((person) => (person.city.toLowerCase() === "Himachal".toLowerCase() && person.age >= 18)).map((person) => person.name);
console.log(filter);

//name => age people from chandigarh

let filter2 = user.reduce(function(custom_obj , person){
        custom_obj[person.name]= person.age;
        return custom_obj;
},{});
console.log(filter2);

let arr = [-1,-2,-3,-4,-5,-6,-7];
//get max value
console.log(Math.max(...arr));
let max = arr.reduce((maxi, curr)=>{
    return (maxi < curr ? curr : maxi);
});
console.log(max);

//get max aje form from person age obj
console.log(Math.min(...user.map((person) => person.age)));

a = "1233sssgg";
a.filter(ch => isNaN(val))

