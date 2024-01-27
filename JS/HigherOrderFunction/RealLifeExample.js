const squareArea = (side) => side*side;
const cirleArea = (radius) => 3.14*radius*radius;


console.log("No abstract way .....")
console.log(squareArea(1));
console.log(cirleArea(2))

//in future if any other function then we need to call same way. so we're going to common function to calculate area


console.log(" abstract way .....");

function calculateArea(paramter , logic){
    return logic(paramter);
}


console.log(calculateArea(1,squareArea));
console.log(calculateArea(2,cirleArea));

