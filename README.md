# **Rick and Morty Character Search App**

  This project allows users to search for characters from the Rick and Morty API. Users can enter text into a search bar to view a list of characters whose names match the search string. The app features a grid view for character display and a detailed screen for individual character information.

**Screens**
------------
  **Character List Screen:**
  - Displays characters in a grid view with 2 columns.
  - Includes a search bar at the top for filtering characters by name.
  - By default, the app loads characters with the name "Smith" on launch.
  - The search bar updates results dynamically on each keystroke, with no input limit.
  - A clear button (cross icon) is available to reset the search text.

  **Character Details Screen:****
  - Displays detailed information about a selected character, including:
  - Image
  - Name
  - Type
  - Origin
  - Creation date

**Tech Stack**
  
  Jetpack Compose: For building modern, declarative UI components.
  Hilt: For dependency injection.
  Retrofit: For seamless web service integration.
  UDF Pattern (Unidirectional Data Flow): For state management and predictable data operations.
  Unit Testing: To ensure functionality and reliability.

**Functionality**
**List Screen**
  Displays characters in a grid layout with 2 columns.
  The search bar dynamically filters characters based on user input, updating the UI in real-time.
  A clear button allows users to reset the search input.

**Details Screen**
  Provides detailed information about a selected character, including:
    Profile image
    Name
    Type
    Origin
    Creation date

**How It Works**
    Default Search: On app launch, characters with the name "Smith" are displayed by default in a grid view.
    Dynamic Search: The search bar updates results dynamically as users type. No need to press "Enter."
    Clear Search: Users can clear the search text using the cross icon in the search bar.
    Details View: Clicking on a character opens their detailed profile.

**References**
  Rick and Morty API Documentation
  Example API Endpoint: https://rickandmortyapi.com/api/character/?name=mar

This project demonstrates efficient use of modern Android development tools and patterns to create an interactive and user-friendly application.

