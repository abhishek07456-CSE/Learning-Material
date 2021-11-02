let item = [
    {
        name : "abhishek",
        id : 31,
        marks : 100
    },
    {
        name : "aayush",
        id : 2,
        marks : 90

    },
    {
        name : "abhishek",
        id : 27,
        marks : 100
    },
    {
        name : "abhishek",
        id : 29,
        marks : 90
    },
];

console.log("a > A " + ("a".localeCompare("A")));
console.log("b > a " + "b".localeCompare("a"));
console.log("a = a " + "a".localeCompare("a"));

item.sort((a,b) => {return b.marks- a.marks || a.name.localeCompare(b.name) || b.id - a.id});
console.log(item);