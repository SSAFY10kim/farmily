// MainPage.js
import { useState, useEffect } from "react";
import React from "react";
import { GridProvider } from "../components/tree/GridContext";
import Fruits from "../components/tree/Fruits";
import GridBoard from "../components/tree/GridBoard";
import MainTree from "../components/tree/MainTree.jsx";
import Challenge from "../components/tree/Challenge.jsx";
import Board from "../components/tree/Board.jsx";

const MainPage = () => {
  return (
    <GridProvider>
      <Fruits />
      <GridBoard />
      <Challenge />
      <MainTree />
      <Board />
      {/* 다른 컴포넌트들도 여기에 포함될 수 있습니다. */}
    </GridProvider>
  );
};

export default MainPage;
