## How to run
<ol>
    <li>Locate the "Main" class</li>
    <li>Run the static "main" method</li>
    <li>Results are logged in the console</li>
</ol>

## Report
### Initial "problem"
<p>Initially, our application didn't have any issues, despite the fact that it obviously should.<br/>
The application should theoretically have a race condition, however,
the time it took for a thread to finish its operation was shorter than the time it took for the next thread to start.
This lead to the threads essentially just running in order, which worked perfectly fine. <br/>
However, if ran on a very slow computer, this might not be the case.</p>

### Creating the problem
<p>To actually create the problem we were supposed to solve, we implemented an artificial delay on registering tickets,
to simulate a slow & old machine. <br/>
This created the race condition we expected to see, and allowed all threads to successfully book tickets,
exceeding the number of available seats.</p>

### Solving the problem
<p>To solve the problem, we added the synchronized keyword to the "bookTicket" method in the "MovieTicketServer" class.
This only allows one thread to access it at a time, avoiding any possible race conditions.</p>