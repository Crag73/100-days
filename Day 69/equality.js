// Difference between == & ===

// "==" -> JS performs Implicit Type Conversion before comparing

// "===" -> No Type Conversion

console.log(1 == "1");    // Number('1') = 1
console.log(1 === "1");
console.log([] == "");     //console.log(""=="")----> true;
console.log([] == " ");
// console.log([] === "");   //This condition will always return false since js compares objects by reference
console.log(String([]));
console.log("Hi");

// When == checks, a non primitive data type is converted into primitive as we have its reference only

console.log([] == 0);   // True [] gets converts to 0 in number and "" in string
console.log({} == {});   // False Objects are compared by reference
console.log("" == 0);
console.log(" " == 0);  //True Because " " gets converted to 0
console.log(" " == "") // False