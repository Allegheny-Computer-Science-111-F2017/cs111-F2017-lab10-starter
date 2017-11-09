<!---

TASK LIST:

  * Use cp -rf *.* to copy all of the files and directories in this repository
    to the starter repository for this assignment
  * Change into the directory for the starer repository
  * Update the header (e.g., #) to only give the name of the assignment
  * Update the first paragraph to include the commented-out content
  * Change the link in the # Problems section to point to this lab's starter
  * Create the assignment in the GitHub Classroom, noting the URL
  * Test the assignment by accepting it with your own GitHub account
  * Check to ensure that your GitHub repository is created correctly
  * Share the assignment link with all of the students using email or Slack

PROBLEMS?

  * Contact Gregory M. Kapfhammer by email or Slack
  * Raise an issue in the GitHub repository for this assignment

FOR THIS ASSIGNMENT: Ultimately, it would be useful to setup a naming convention
for the graphics files and then check to ensure that a certain number of
available in the GitHub repository. I did not have time to implement this feature.

-->

# cs111-F2017-lab10-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter for Laboratory 10 in Computer Science 111.

## Introduction

This assignment requires programmers run study the output of two Java programs,
called `MandelbrotBlackAndWhite` and `MandelbrotColor`. These two programs use
multiple types of iteration constructs and conditional logic to produce
Mandelbrot images. If you want to learn more about the Mandelbrot set and the
associated images, please review this [Wikipedia
article](https://en.wikipedia.org/wiki/Mandelbrot_set). You and your team
members will run these programs in order to carefully characterize both their
graphical output and their execution time efficiency. Please read the laboratory
assignment sheet for more details about how you should complete these tasks.

The programmers are also responsible for writing a three-paragraph reflection,
stored in the file `writing/reflection.md`, that explains the challenges that
they faced and the solutions they developed as they were running the Mandelbrot
programs. Additionally, you should write a file called `writing/color.md` that
explains, for all of the separate configurations of the `MandelbrotColor`
program that you are asked to investigate, the variations in color and shape
that you observe in the generated images. Finally, you are invited to write a
file called `writing/time.md` that uses Markdown tables to record the execution
times associated with running the `MandelbrotColor` program in different
configurations.

These Markdown files that must adhere to the standards
described in the [Markdown Syntax
Guide](https://guides.github.com/features/mastering-markdown/). Remember, you
can preview the contents of a comitted Markdown file by clicking on the name of
the file in your GitHub repository. Finally, don't forget that your
`writing/reflection.md` file should adhere to the Markdown standards established
by the [Markdown linting tool](https://github.com/markdownlint/markdownlint) and
the writing standards set by the [Proselint tool](http://proselint.com/). For
this laboratory assignment, the team members should jointly write the first
paragraph. Then, each team member should write their own reflection that
comments on their individual experiences in completing the assignment. To ensure
that students can flexibly complete all of the writing for this laboratory
assignment, none of the writing checks will be performed for the
`writing/color.md` and `writing/time.md` files.

Please note that, for this assignment, you and your team members are only
required to make minimal changes to the two provided programs. As such, there
are no source code checks for this assignment. Instead, you will be required to
run the programs in different configurations and then generate and commit
the graphics that correspond to the run from each program configuration.

When you use the `git commit` command to transfer your source code to your
GitHub repository, [Travis CI](https://travis-ci.com/) will check some of the
writing in your assignment, ensuring that it meets all of the requirements. If
both your source code and writing meet all of the established requirements, then
you will see a green &#x2714; in the listing of commits in GitHub. If your
submission does not meet the requirements, a red &#x2717; will appear instead.
The instructor will reduce a programmer's grade for this assignment if the red
&#x2717; appears on the last commit in GitHub immediately before the
assignment's due date.

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides. In particular, please make sure that you have read the
following GitHub guides: [Mastering
Markdown](https://guides.github.com/features/mastering-markdown/), [Hello
World](https://guides.github.com/activities/hello-world/), and [Documenting Your
Projects on GitHub](https://guides.github.com/features/wikis/). Each of these
guides will help you to understand how to use both [GitHub](http://github.com) and
[GitHub Classroom](https://classroom.github.com/).

To do well on this assignment, you should also review Chapters 1 through 4 and
study Sections 6.1 through 6.4 and Section 8.1. Please see the course instructor
or one of the teaching assistants or tutors if you have questions about any of
these reading assignments.

## Commands

You can also complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is a correct program) the program using the command
`gradle build`. There are also additional commands that you can type:

* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main directory for this
assignment where the `build.gradle` file is located. Then, you can type the
command in the terminal and study the output. Please note that, since this
program interacts with the user in the terminal window, you must run it
differently than you ran past programs. Specifically, you should use the
following command to run the `MandelbrotBlackAndWhite`:

```
gradle -b build-bw.gradle run
```

When you want to run the `MandelbrotColor` program, please type:

```
gradle -b build-color.gradle run
```

Please note that once you change the value of a variable in the
`MandelbrotColor` program you will need to build the program again before
running it. Please see the course instructor if you notice that the graphical
output in the file never changes. Finally, you will need to save each of the
graphical output files to a file with a unique name; you can use the `cp`
command to accomplish this task. Please make sure that you correctly save all of
your graphics to the `graphics` directory; note that the sample files in this
directory are only there for illustrative purposes and are not the ones that you
need to commit in order to complete this assignment.

## Travis

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
a checking program every time you commit to your GitHub repository. The
checking will start as soon as you have accepted the assignment, thus creating
your own private repository, and the course instructor enables Travis for it. If
you are using Travis for the first time, you will need to authorize Travis CI to
access the private repositories that you created on GitHub.

## Requirements

The GatorGrader software that supports the checking of this assignment was
developed for the following software and versions:

* gradle 4.1
* java 1.8.0
* mdl 0.4.0
* proselint 0.7.0

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 111 Lab 10
Starter](https://github.com/Allegheny-Computer-Science-111-F2017/cs111-F2017-lab10-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader
tool](https://github.com/gkapfham/gatorgrader) and the way that it checks you
assignment, then you can follow the aforementioned steps to create an issue in
its repository. To ensure that your issue is properly resolved, please provide
as many details as is possible about the problem that you experienced. If you
discover a problem with the laboratory assignment sheet, then please raise an
issue in the
[cs111-F2017-lab-sheets](https://github.com/Allegheny-Computer-Science-111-F2017/cs111-F2017-lab-sheets)
repository and mention this assignment.

Students who find, and use the appropriate GitHub issue tracker to correctly
document, a mistake in any aspect of this laboratory assignment will receive
free laptop stickers and extra credit towards their grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack team for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
