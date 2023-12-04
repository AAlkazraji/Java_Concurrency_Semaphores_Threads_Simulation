# Java_Concurrency_Semaphores_Threads_Simulation

## Description

This Java project simulates a scenario where a single lane bridge connects the North Island to the South Island of New Zealand. Farmers from each island transport produce across the bridge repeatedly, taking 20 steps to complete a crossing.

The challenge arises when deadlock scenarios occur due to stubborn farmers unwilling to yield. To prevent deadlocks, the program uses semaphores, utilizing threads to simulate multiple concurrent farmers attempting to cross from both directions. Parameters can be input at runtime to specify the number of farmers from each direction.

## Running the Simulation

To run the simulation, pass the file `P1-1.txt` as an argument, initializing the scenario with farmers from both islands constantly attempting to use the bridge. The program ensures a deadlock-free and starvation-free solution while adding a 20ms delay after every 5 steps taken by the farmers.

## Sample Input/Output

The input file (`P1-1.txt`) initializes the program with 2 farmers from each direction, showcasing a partial output from one execution. Please note that the output may vary from run to run, demonstrating the simulation of farmers' interactions while crossing the bridge.

