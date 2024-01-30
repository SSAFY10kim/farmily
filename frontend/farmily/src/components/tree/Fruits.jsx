// Fruits.js
import React from "react";
import { useGrid } from "./GridContext";
import EventFruit from "../../assets/images/EventFruit.png";

const Fruits = () => {
  const { addItem } = useGrid();

  const handleFruitClick = () => {
    // 임의의 아이디와 좌표를 설정합니다. 실제 구현에서는 사용자가 선택한 좌표를 사용해야 합니다.
    addItem({ id: Date.now(), image: EventFruit, x: 100, y: 100 });
  };

  return (
    <div className="fruits">
      <img src={EventFruit} alt="Fruit" onClick={handleFruitClick} />
    </div>
  );
};

export default Fruits;
