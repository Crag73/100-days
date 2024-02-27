import { NextResponse } from "next/server";

export async function GET(){
    return NextResponse.json(
    [
        {
            id:1,
            products:"berry",

        },
        {
            id:2,
            products:"apple"
        }
    ]
    )
}



