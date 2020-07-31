import React from 'react'

export interface AuthorViewProps {
    id: number,
    name: string,
}

export function AuthorView(props: AuthorViewProps){
    return (
        <div>
            <h3>Author</h3>
            <div>ID: {props.id}</div>
            <div>Name: {props.name}</div>
        </div>
    )
}