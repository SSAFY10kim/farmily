// GridContext.js
import React, { createContext, useContext, useState } from "react";

const GridContext = createContext();

export const useGrid = () => useContext(GridContext);

export const GridProvider = ({ children }) => {
  const [items, setItems] = useState([]);

  const addItem = (item) => {
    setItems((prevItems) => [...prevItems, item]);
  };

  const removeItem = (id) => {
    setItems((prevItems) => prevItems.filter((item) => item.id !== id));
  };

  const clearItems = () => {
    setItems([]);
  };

  return (
    <GridContext.Provider value={{ items, addItem, removeItem, clearItems }}>
      {children}
    </GridContext.Provider>
  );
};
