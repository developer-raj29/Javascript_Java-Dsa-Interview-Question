/**
 * Problem Statement: Display Users in Alphabetical Order with Capitalized Names
 * Expected OUTPUT:
 * User names
 * 1. Adam Rose
 * 2. Adam Wayne
 * 3. Billy Doe
 * 4. Jane Doe
 * 5. John Doe
 *
 */

import React from "react";

const users = [
  { name: "john doe", id: 1 },
  { name: "jane doe", id: 2 },
  { name: "billy doe", id: 3 },
  { name: "adam Rose", id: 4 },
  { name: "adam wayne", id: 5 },
];

function App() {
  const sortedUsers = [...users].sort((a, b) =>
    a.name.localeCompare(b.name, undefined, { sensitivity: "base" })
  );

  // Function to capitalize names properly
  const capitalizeName = (name) => {
    return name
      .split(" ")
      .map((word) => word.charAt(0).toUpperCase() + word.slice(1).toLowerCase())
      .join(" ");
  };

  return (
    <>
      <h3>User names</h3>
      <div>
        {sortedUsers.map((user, index) => (
          <p key={user.id} style={{ display: "flex", gap: "5px" }}>
            <span>{index + 1}.</span>
            {capitalizeName(user.name)}
          </p>
        ))}
      </div>
    </>
  );
}

export default App;
