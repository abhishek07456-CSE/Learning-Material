/* filter out number the reduce it number */
function sum(...args) {
	return args
		.filter(function (e) {
			return typeof e === "number";
		})
		.reduce(function (prev, curr) {
			return prev + curr;
		},0);
}
let result = sum(10,'Hi',null,undefined,20);
console.log(result);
/*here arguments not member of array so here need to apply filter*/

function sum() {
	return Array.prototype.filter
		.call(arguments, function (e) {
			return typeof e === "number";
		})
		.reduce(function (prev, curr) {
			return prev + curr;
		});
}