# Volkswagen B3 Car Application Manual Service

This is a Java-based desktop application for managing various functionalities of a Volkswagen B3 car vehicle. The application uses Swing for the GUI and supports multiple languages (English and Romanian).

[//]: # (![menu.png]&#40;/overview/menu.png&#41;)

[//]: # (![engine.png]&#40;/overview/engine_management.png&#41;)

[//]: # (![engine2.png]&#40;/overview/engine_management_crankshaft.png&#41;)

[//]: # (![ecu.png]&#40;/overview/ecu.png&#41;)

<img src="/overview/menu.png" alt="drawing" style="width:280px;height:200px"/>
<img src="/overview/engine_management.png" alt="drawing" style="width:350px;height:200px"/>
<img src="/overview/engine_management_crankshaft.png" alt="drawing" style="width:300px;height:163px"/>
<img src="/overview/ecu.png" alt="drawing" style="width:300px;height:163px"/>


## Features

- Language selection (English and Romanian)
- Trouble shooter
- EMCT forms
- ECU forms
- Guidelines and diagrams

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Ant for building the project

## Getting Started

### Building the Project

1. Clone the repository:
    ```sh
   https://github.com/glcata/volkswagen_b3.git
    cd volkswagen-b3
    ```

2. Build the project using Ant:
    ```sh
    ant build
    ```

### Running the Application

1. Run the application:
    ```sh
    ant run
    ```
    or simply run the `menu` class from your IDE.

## Project Structure

- `src/`: Contains the source code of the application.
- `build.xml`: Ant build script for compiling and running the project.

## Code Overview

### Main Class

The main class of the application is `menu.java`, which initializes the GUI and handles user interactions.

### Language Support

The application supports English and Romanian languages. The language resources are located in the `emct` package.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author & Developer

- Catalin Glavan
