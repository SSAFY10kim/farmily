// GridBoard.js
import React from "react";
import { useGrid } from "./GridContext";

const GridBoard = () => {
  const { items, removeItem } = useGrid();

  return (
    <div className="grid-board">
      {items.map((item) => (
        <div
          key={item.id}
          className="grid-item"
          style={{ left: item.x, top: item.y }}
          onDoubleClick={() => removeItem(item.id)}
        >
          <img src={item.image} alt="Grid item" />
        </div>
      ))}
    </div>
  );
};

export default GridBoard;
