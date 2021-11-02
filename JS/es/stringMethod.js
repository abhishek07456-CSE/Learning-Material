const a = "hello";
console.log(a.length);
console.log(a.charCodeAt(0));
console.log(a.indexOf('l'));
console.log(a.indexOf('a'));
console.log(a.padStart(6,0));
console.log(a.padEnd(9,0));
console.log(a.lastIndexOf('l'));
console.log(a.substr(-2,4));
console.log(a.substring(-0,-2));

const ab = "h-e-l-l-o";
console.log(ab.split('-').join('1'));