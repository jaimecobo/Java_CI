const numbers = [
    0x7E,
    0x30,
    0x6D,
    0x79,
    0x33,
    0x5B,
    0x5F,
    0x70,
    0x7F,
    0x7B
]

const Colon = (props) => {
  return (
    <div className={`Colon ${props.blink ? 'Colon--blink' : ''}`} />
  )
}

const Segment = (props) => {
  return (
    <div className={`Segment Segment-${props.position} ${props.on ? 'Segment--on' : ''}`}></div>
  )
}

const Display = (props) => {
  const segments = ["G","F","E","D","C","B","A"]
  const bit = numbers[props.value]
  return (
    <div className="Display">
      {segments.map((seg, i) => {
        return (<Segment on={((bit >> i) & 1) == 1 ? true : false} position={seg}/>)
      })}
    </div>
  )
}

class Clock extends React.Component {
  constructor(props) {
    super(props)
    this.state = this.parseTime()
  }
  
  componentDidMount() {
    this.timerID = setInterval(
      () => this.tick(),
      1000
    );
  }

  componentWillUnmount() {
    clearInterval(this.timerID);
  }
  
  parseTime() {
    const hours = ((new Date()).getHours() % 12).toString().split('')
    const minutes = ((new Date()).getMinutes()).toString().split('')
    const seconds = ((new Date()).getSeconds()).toString().split('')

    if (hours.length == 1) {
      hours.splice(0, 0, null)
    }
    if (hours[0] == '0' && hours[1] == '0') {
      hours[0] = '1'
      hours[1] = '2'
    }
    if (minutes.length == 1) {
      minutes.splice(0, 0, '0')
    }

    if (seconds.length == 1) {
      seconds.splice(0, 0, '0')
    }

    return { hours: hours, minutes: minutes, seconds: seconds}
  }

  tick() {
    this.setState(this.parseTime())
  }
  
  render() {
    return (
    <div style={{display:'flex',justifyContent:'center',alignItems:'center',height:'100vh'}}>
      <Display value={this.state.hours[0]}/>
      <Display value={this.state.hours[1]}/>
      <Colon />
      <Display value={this.state.minutes[0]}/>
      <Display value={this.state.minutes[1]}/>
      <Colon blink />
      <Display value={this.state.seconds[0]}/>
      <Display value={this.state.seconds[1]}/>
    </div>
    ) 
  }
}

ReactDOM.render(<Clock />, document.getElementById("root"));