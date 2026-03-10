/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let val=init;
    let dummy = init;
    return {
        increment(){
            dummy= dummy+1;
            return dummy;
        },
        decrement(){
             dummy= dummy-1;
            return dummy;
        },
        reset(){
            dummy=val
            return dummy;
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */