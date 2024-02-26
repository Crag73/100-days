export let a:number=20;

export function isLegal(age:number):boolean{
    if(age>18){
        return true;
    }
    return false;
}