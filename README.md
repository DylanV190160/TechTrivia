<!-- MARKDOWN LINKS & IMAGES -->
[image1]: Images/Image1.png
[image2]: Images/Image2.png
[image3]: Images/Image3.png
[image4]: Images/Image4.png
[image5]: Images/Image5.png
[image6]: Images/Image6.png
[image7]: Images/Image7.png
[image8]: Images/Image8.png

<!-- PROJECT LOGO -->
<br />

<h6 align="center">Dylan Vanhout</h6>
<p align="center">
<br />
   
  <a href="https://github.com//dylanV190160/TechTrivia">
    <img src="Images/App Icon.png" alt="Logo" width="160" height="160">
  </a>
  
  <h2 align="center">TechTrivia</h2>

  <p align="center">
    Technology Trivia Quiz App.
  </p>

<!-- TABLE OF CONTENTS -->
## Table of Contents

- [Table of Contents](#table-of-contents)
- [About the Project](#about-the-project)
  - [Project Description](#project-description)
  - [Built With](#built-with)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [How to install](#how-to-install)
  - [Installation](#installation)
- [Features and Functionality](#features-and-functionality)
  - [Features](#features)
  - [Functionality](#functionality)
- [Concept Process](#concept-process)
  - [Ideation](#ideation)
  - [Wireframes](#wireframes)
  - [User-flow](#user-flow)
- [Development Process](#development-process)
  - [Implementation](#implementation)
    - [Challenges](#challenges)
  - [Peer Reviews](#peer-reviews)
    - [Feedback](#feedback)
    - [Future Changes](#future-changes)
- [Video Demonstration](#video-demonstration)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [Authors](#authors)
- [License](#license)
- [Contact](#contact)
- [Acknowledgements](#acknowledgements)

<!--PROJECT DESCRIPTION-->
## About the Project

![image1][image1]

### Project Description

TechTrivia is a Android Quiz application that will test you tech knowledge. The App was built using Android studio and Kotlin.

### Built With

* [Android Studio](https://developer.android.com/studio)
* [Kotlin](https://kotlinlang.org/)
* [GitHub](https://github.com/)

<!-- GETTING STARTED -->
## Getting Started

To get started follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Ensure that you have the latest updated version of Android Studio installed on your machine. The `Kotlin` plugin will also be required.

### How to install

### Installation
Ways to clone this repo:

1. Android Studio </br>
`Android Studio` -> `File` -> `New` -> `From Version Control` -> `Git`</br>
Enter `https://github.com/dylanv190160/techtrivia.git` into the URL field and press the `Clone` button.

2. Command-line + Android Studio </br>
Run the following in the command-line to clone the project:
   ```sh
   git clone https://github.com/dylanv190160/techtrivia.git
   ```
Open `Android Studio` and select `File | Open...` from the menu. Select the newly cloned directory and press `Open` button

<!-- FEATURES AND FUNCTIONALITY-->
## Features and Functionality

### Features

![image2][image2]
* Users can enter their name which will be displayed in the categories page.

* Validation is displayed if no name has been entered into the text field.

![image3][image3]

* Choose from 3 technology categories.
  - The categories are People, Terminology and Devices.

* Test your tech knowledge by answering the questions in each category.

* Highest Score for each category is displayed below the category.

![image4][image4]
* Selete the correct answer with the radio buttons.
  - Only one option per question is selectable.

* Validation is provided when the user clicks next.

* The progress bar updates occording to which question you are on.

![image4][image5]

* Results are displayed after all the questions have been answered.
  
* Alternative screens displayed depending on results obtained.

* Button takes you back to the categories screen.

### Functionality

* `Scroll`, `Linear` and `Grid` layouts were used for the page layouts.
* `Activities` were used to create the quiz categories and questions.
* A `Constants` file was created to store all the questions in using an `ArrayList`.
* Each questions activity has a `Progress Bar` to indicate to the user which question they are on.
* `SharedPreferences` was used the store the username, results and  highest scores.

<!-- CONCEPT PROCESS -->
## Concept Process

The research and planning that was done for this project.

### Ideation

![image5][image6]

### Wireframes

![image7][image7]

### User-flow

![image8][image8]

<!-- DEVELOPMENT PROCESS -->
## Development Process

The technical implementations and functionality.

### Implementation

#### Challenges

* Learning how to implement layouts and imagery with Kotlin and Android Studio.
* Styling the frontend of the app. Learning the correct syntax.
* Using `SharedPreferences` to store the highest score and username.
* Learning how to use `Activities` and `Intent` for navigation and functionality.
* I enjoed the project and found that I have learned alot in regards to androind app development.

### Peer Reviews

Feedback from other students and the lecturer.
* Peers like the technical aspect and approaches.
* Peers found the app to be easy to use and concise to navigate.
* Peers found the questions to be suitable for the theme and categories.
* Peers thought the colours matched the theme well with the dark background supporting the narrative.

#### Feedback

* Change the font size, style and colour to be more readable.
* Add more imagery to the questions to possibly make it more fun and less serious.
* Add more patterns to either the background or vectors to elevate the design.
* Add a back button the the results page to allow the users to retun home. 

#### Future Changes

* Add a High Score page.
* Add more questions to each category.
* Add imagery to the questions and patterns to the background.
* Add a button to change the username and a button to clear the scores.
* Add a App icon.
* Add the option to continue as the previous user or create a new user.

<!-- VIDEO DEMONSTRATION -->
## Video Demonstration

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/dylanv190160/techtrivia/issues) for a list of proposed features (and known issues).

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- AUTHORS -->
## Authors

* **Dylan Vanhout**

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.

<!-- LICENSE -->
## Contact

* **Dylan Vanhout** - 190160@virtualwindow.co.za
* **Project Link** - https://github.com/dylanv190160/techtrivia/

<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements

* [Android Documenation](https://developer.android.com/docs)
* [StackOverflow](https://stackoverflow.com/)
* [Flaticon](https://www.flaticon.com/)
* My lecturer Armand Pretorius.
