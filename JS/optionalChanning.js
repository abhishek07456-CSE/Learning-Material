let user = {
    name : "abhishek chaudhary",
    address : {
        street : "vikas nagar",
        homeno : 2696
    },
    getDetails : () => {
        console.log("hello world");
    }
}
console.log(user?.name);
console.log(user?.address);
user.getDetails?.();
// user.email(); //throw error
user.email?.();
// user?.name = "hello"; // throw error
user?.getDetails?.()
delete user?.address;
console.log("address" in user);
