export default function ProductDetails({ params }:{
    params: {ProductId: number}
}){
    return <h1>Details About Product {params.ProductId}</h1>
}