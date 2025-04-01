/**
 Problem Statement:

 Develop a React web application with a singular "App" component. The application should possess the following functionalities:

 1. Allow users to place a dot on any location within the page by simply clicking on the desired spot.
 2. Incorporate two buttons:
   - "Undo": This button should remove the most recently placed dot.
   - "Redo": This button should reinstate a dot that was removed by the "Undo" action.

 Your solution should efficiently handle multiple "Undo" and "Redo" actions sequentially.
   
*/
import React, { useState } from "react";
import "./style.css";

export default function App() {
  const [dots, setDots] = useState([]); // Stores placed dots
  const [redoStack, setRedoStack] = useState([]); // Stores removed dots for redo

  const handleClick = (event) => {
    const newDot = { x: event.clientX, y: event.clientY };
    setDots([...dots, newDot]);
    setRedoStack([]); // Clear redo history on new dot placement
  };

  const handleUndo = () => {
    if (dots.length === 0) return;
    const lastDot = dots[dots.length - 1];
    setRedoStack([...redoStack, lastDot]);
    setDots(dots.slice(0, -1));
  };

  const handleRedo = () => {
    if (redoStack.length === 0) return;
    const lastRemoved = redoStack[redoStack.length - 1];
    setDots([...dots, lastRemoved]);
    setRedoStack(redoStack.slice(0, -1));
  };

  return (
    <div className="container" onClick={handleClick}>
      {dots.map((dot, index) => (
        <div
          key={index}
          className="dot"
          style={{ left: dot.x, top: dot.y }}
        ></div>
      ))}
      <div className="controls">
        <button onClick={handleUndo} disabled={dots.length === 0}>
          Undo
        </button>
        <button onClick={handleRedo} disabled={redoStack.length === 0}>
          Redo
        </button>
      </div>
    </div>
  );
}
