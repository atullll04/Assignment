// Primitive Data Types in JavaScript
// 1. String
var firstName = "John Doe";
var lastName = "Jane Smith"; // Reassigning the variable
console.log("Name:", lastName);

// 2. Number
var age = 30;   
age = 31; // Reassigning the variable
console.log("Age:", age);
console.log("Type of Age:", typeof age); // Output: number
var height = 5.9; // Float number
height = 6.0; // Reassigning the variable
console.log("Height:", height);
console.log("Type of Height:", typeof height); // Output: number

// 3. Boolean
var isStudent = true; // Boolean value      

isStudent = false; // Reassigning the variable
console.log("Is Student:", isStudent);
console.log("Type of Is Student:", typeof isStudent); // Output: boolean

// 4. Undefined
var address; // Variable declared but not initialized

console.log("Address:", address); // Output: undefined
console.log("Type of Address:", typeof address); // Output: undefined
// 5. Null
var phoneNumber = null; // Explicitly set to null
console.log("Phone Number:", phoneNumber); // Output: null
console.log("Type of Phone Number:", typeof phoneNumber); // Output: object

// 6. Symbol (ES6 feature)
var uniqueId = Symbol("id"); // Unique identifier       
console.log("Unique ID:", uniqueId); // Output: Symbol(id)
console.log("Type of Unique ID:", typeof uniqueId); // Output: symbol
// 7. BigInt (ES11 feature)
var bigNumber = BigInt(123456789012345678901234567890); // Large integer
console.log("Big Number:", bigNumber); // Output: 123456789012345678
console.log("Type of Big Number:", typeof bigNumber); // Output: bigint