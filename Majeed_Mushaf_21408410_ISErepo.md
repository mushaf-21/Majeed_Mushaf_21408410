# ISE Assignment (2023-S2-V1)

- **Assessment Name:** Introduction to Software Engineering
- **Your Name (as in Blackboard):** Mushaf Majeed
- **Curtin Student ID:** 21408410
- **Practical Class (Date/Time):** 20/10/2023
17/10/2023


---

# Introduction
I created a GitHub repository via GitHub Desktop. This initial step involved setting up a version control system to manage the project efficiently. With the repository in place, I could easily track changes, collaborate with others, and maintain a comprehensive history of the project's development. Creating a repository from the outset is crucial for ensuring the project's organization and version control.
Once the repository was established, I moved on to the core of the project. Thoroughly understanding the tasks that needed to be performed was pivotal. This involved a detailed analysis of the project requirements and objectives, breaking them down into manageable components. A clear understanding of the tasks was essential to ensure that the project would meet its goals effectively and efficiently.
Upon a comprehensive grasp of the requirements, the next step was to create test cases. Writing test cases served as a critical quality assurance measure. These test cases provided a structured framework for evaluating the functionality and performance of the developed code. Each test case was designed to validate a specific aspect of the project, ensuring that it met the desired specifications.
With the test cases in hand, I began the process of developing the code. Each line of code was written with the test cases in mind, ensuring that the project's functionality aligned with the predefined requirements. This approach not only guaranteed that the project met its goals but also made debugging and troubleshooting more systematic and efficient.
In addition to diligent coding, I maintained a disciplined daily routine. At the end of each workday, I made it a practice to commit and push my work to the repository. This not only acted as a backup of the project but also allowed for a transparent and continuous record of project development. It provided insights into the progress made on a daily basis, facilitating collaboration and tracking the project's evolution.
# Modularity design
## Shape Identification Module
- **Description**: This module identifies the shape of a regular polygon based on the number of sides given.
- **Inputs**: The number of sides of the polygon.
- **Output**: Returns the name of the identified shape and, optionally, an image of the shape.
- **Assumptions**: Validates input for a valid range (e.g., between 3 and 7) and handles invalid inputs.

## Area and Perimeter Calculation Module
- **Description**: This module calculates the area and perimeter of a regular polygon.
- **Inputs**: Length of a side and, optionally, the number of sides or the shape name.
- **Output**: Returns the area and perimeter. Can also display a message comparing the calculated area with two given situations.
- **Assumptions**: Validates input, handles situations when the number of sides is outside the expected range, and calculates area and perimeter correctly.

## Image Display Module
- **Description**: This module displays images of regular polygons.
- **Inputs**: The name of the shape.
- **Output**: Displays the image on the screen.
- **Assumptions**: Has access to predefined images in the "ISEimages" folder.

## Input Validation Module
- **Description**: This module validates user inputs for the number of sides and length of sides.
- **Inputs**: User inputs from the keyboard or parameters.
- **Output**: Provides validation feedback and ensures inputs are within the expected range.
- **Assumptions**: Handles invalid inputs and provides user-friendly error messages.

## Message Display Module
- **Description**: This module handles the display of messages and results to the user.
- **Inputs**: Messages and results to be displayed.
- **Output**: Displays messages on the screen.
- **Assumptions**: Communicates results, validation messages, and comparisons between calculated and given values.

## Main Module (Orchestrator)
- **Description**: The main module that coordinates the workflow, interacts with the user, and calls other modules.
- **Inputs**: User inputs and function calls to other modules.
- **Output**: Communicates with other modules and displays results to the user.
- **Assumptions**: Drives user interaction, handles the main program flow, and ensures the correct execution of various sub-modules.

