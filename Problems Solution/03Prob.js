/**
 * Problem: Complete the Traffic Light component that changes the light color every 1 second in the sequence:
 * Red -> Yellow -> Green -> Red, in an infinite loop.
 *
 * BONUS: Add a button to pause or resume the light-changing sequence.
 */

import React, { useState, useEffect } from "react";
import "./App.css";

const TrafficLight = () => {
  const lights = ["red", "yellow", "green"]; // Traffic light sequence
  const [lightIndex, setLightIndex] = useState(0);
  const [isRunning, setIsRunning] = useState(true);

  useEffect(() => {
    if (!isRunning) return; // Pause functionality

    const interval = setInterval(() => {
      setLightIndex((prevIndex) => (prevIndex + 1) % lights.length);
    }, 1000);

    return () => clearInterval(interval); // Cleanup on unmount
  }, [isRunning]);

  return (
    <div className="traffic-light-container">
      <div className="traffic-light">
        {lights.map((color, index) => (
          <div
            key={color}
            className={`light ${lightIndex === index ? color : ""}`}
          ></div>
        ))}
      </div>
      <button onClick={() => setIsRunning(!isRunning)}>
        {isRunning ? "Pause" : "Resume"}
      </button>
    </div>
  );
};

function App() {
  return (
    <div className="App">
      <h3>Traffic Light</h3>
      <TrafficLight />
    </div>
  );
}

export default App;
