import { useState } from 'react'
import './App.css'

export default function App() : JSX.Element {
  const [count, setCount] = useState(0)

  return (
    <>
    <h1 className="text-3xl font-bold underline">
      Hello world!
    </h1>
    </>
  )
}

