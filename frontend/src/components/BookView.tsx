import React from 'react'

export interface BookViewProps {
    id: number,
    name: string,
}

export function BookView(props: BookViewProps){
    return (
        <div>
            <h2>{props.name}</h2>
            <div>ID: {props.id}</div>
        </div>
    )
}