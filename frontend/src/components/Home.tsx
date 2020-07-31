import React from "react";
import { ApolloProvider } from "@apollo/client";
import { client } from "../config/client";
import { NiceWay } from "./NiceWay";

export function Home(props: any) {
  return (
    <ApolloProvider client={client}>
      <NiceWay />
    </ApolloProvider>
  );
}
