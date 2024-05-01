// All the declarations (variable and function) are hoisted at the top of the scope

//Global Execution Context & Local/Functional Execution Context

//Global Execution Context

//a++;                  3
//console.log(a);       4
//var a=10;         1   5
// var b=10;        2   6

//JS runs code in 2 phases

// First Phase : Memory Creation
//  a = undefined
//  b = undefined

//Second Phase : Code Execution
// a++
// console.log(a)
//a=10
//b=10

// So ultimately the code becomes:

// var a;
// var b;
// a++;
// console.log(a);
// a = 10;
// b = 10;

a++                         // undefined + 1
console.log(a)              // NaN
var a = 10
var b = 10

let abc = "abc"
console.log(abc++)          // "abc"++ = NaN
abc = "abc"
console.log(abc + 1)         // "abc" + 1 = abc1

//let does get hoisted but JS does not initialize its value

console.log(c)     //undefined
// console.log(d)     //reference error

var c = 10
let d
console.log(c)
console.log(d)    //JS initializes its value in the execution phase

//In memory creation phase let and const remain in Temporal Dead Zone and give reference error if accessed before
//They remain there until they are called in code execution phase and if no value is provided then its given undefined value'

// refer to this for TDZ : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/let#temporal_dead_zone_tdz