let arr=[1,2,3,4,5,6];

arr.forEach(myfun);

function myfun(val,index,arr){
    console.log(val);
}

arr.forEach(function(val,index,arr){
    console.log(val);
})

let sum=0;
arr.forEach((val)=>{
    sum+=val;
})
console.log(sum);

/////MAP////

let arr1=[1,2,3,4,5];
let mul2=arr1.map((val,index,arr)=>{
    return val*2;
});
console.log(arr1);
console.log(mul2);

let arr2=[234,2343,23,5423,56,25];

let even=arr2.map((val)=>{
    if(val%2==0){
        return val;
    }
});
console.log(even);

/////filter/////
let even2=arr2.filter((val,index,arr)=>{
    if(val%2==0){
        return val;
    }
});
console.log(even2);

////reduce/////
let arr3=[2,5,3,7,8];
let arr3sum=arr3.reduce((accu,val,index,arr)=>{     //accumulator -> intial value
    return accu+val;
})

console.log(arr3);
console.log(arr3sum);

/////sort////
let unsort=[23,1,456,3,55];
let sort=unsort.sort();
console.log(unsort);  //lexographically sorted
unsort.sort(function(a,b){
    return a-b;
}) 
console.log(unsort);