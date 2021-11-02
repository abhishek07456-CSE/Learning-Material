function ArrayDestruction() {
    let a = [1, 3, 4, 5, 6];
    [x, y] = a;
    console.log(x, y);//1 3
    //swap
    [x, y] = [y, x];
    console.log(x, y);// 3 1
    //skip
    [x, , y] = a;
    console.log(x, y);// 1 4

    //spread remaing

    [x, , ...y] = a;
    console.log(x, y);// 1 [4,5,6]

}
ArrayDestruction();

function ObjectDestruction() {
    let details = {
        first_name: "abhishek",
        middle_name: "",
        last_name: "chaudhary"
    }
    //variable name same as key in objects
    let { first_name, last_name } = details;
    console.log(first_name, last_name);

    //with alias
    let { first_name: fname, last_name: lname } = details;
    console.log(fname, lname);

    let { first_name: a, ...b } = details;
    console.log(a, b);

}
ObjectDestruction();

function handleNull() {
    function getPerson() {
        return null;
    }
    // let {fname , lname} = getPerson(); // return cannot destruct from null
    let { fname, lname } = getPerson() ?? {}; //we can handle this by optional operator
    console.log(fname);


    //nested destruction

    let employee = {
        id: 1001,
        name: {
            firstName: 'John',
            lastName: 'Doe'
        }
    };

    let {
        name: {
            firstName,
            lastName
        },
        name
    } = employee;

    console.log(firstName); // John
    console.log(lastName); // Doe
    console.log(name); // { firstName: 'John', lastName: 'Doe' }
}
handleNull();