/**
 * Problem Statement:
 * Implement the missing functionality for the `ImageSlider` component.
 * The `ImageSlider` should display a series of provided images with the following features:
 *
 * 1. Navigation buttons: "Previous" and "Next" to navigate through the images.
 * 2. Play/Stop buttons to start and stop the automatic sliding of images.
 * 3. Automatically transition to the next image every 2 seconds when playing.
 * 4. Stop the automatic transition when the "Stop" button is clicked.
 */

import React, { useState, useEffect } from "react";
import "./App.css";

const SLIDES = [
  "https://placehold.co/400x200?text=1",
  "https://placehold.co/400x200?text=2",
  "https://placehold.co/400x200?text=3",
  "https://placehold.co/400x200?text=4",
];

const Controls = ({ prevSlide, nextSlide, play, stop }) => {
  return (
    <div className="controls">
      <button onClick={prevSlide}>Prev</button>
      <button onClick={nextSlide}>Next</button>
      <button onClick={play}>Play</button>
      <button onClick={stop}>Stop</button>
    </div>
  );
};

const Slide = ({ slideNumber }) => (
  <img src={SLIDES[slideNumber]} alt={`Slide ${slideNumber + 1}`} />
);

const ImageSlider = () => {
  const [currentSlide, setCurrentSlide] = useState(0);
  const [isPlaying, setIsPlaying] = useState(false);
  let intervalRef = React.useRef(null);

  const nextSlide = () => {
    setCurrentSlide((prev) => (prev + 1) % SLIDES.length);
  };

  const prevSlide = () => {
    setCurrentSlide((prev) => (prev - 1 + SLIDES.length) % SLIDES.length);
  };

  const play = () => {
    if (!isPlaying) {
      setIsPlaying(true);
      intervalRef.current = setInterval(() => {
        setCurrentSlide((prev) => (prev + 1) % SLIDES.length);
      }, 2000);
    }
  };

  const stop = () => {
    setIsPlaying(false);
    clearInterval(intervalRef.current);
  };

  useEffect(() => {
    return () => clearInterval(intervalRef.current); // Cleanup on unmount
  }, []);

  return (
    <>
      <Slide slideNumber={currentSlide} />
      <Controls
        prevSlide={prevSlide}
        nextSlide={nextSlide}
        play={play}
        stop={stop}
      />
    </>
  );
};

function App() {
  return (
    <>
      <ImageSlider />
    </>
  );
}

export default App;
